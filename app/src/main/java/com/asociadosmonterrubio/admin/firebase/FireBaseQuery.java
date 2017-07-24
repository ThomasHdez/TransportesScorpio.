package com.asociadosmonterrubio.admin.firebase;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;

import com.asociadosmonterrubio.admin.models.Employee;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by joseluissanchezcruz on 4/23/17.
 */

public class FireBaseQuery {

    public static final String EMPLEADOS = "empleados";
    public static final String CAMPOS = "campos";
    public static final String SALIDAS = "salidasCopia";
    public static final String TEMPORADAS = "temporadas";
    public static final String IMAGENES = "imagenes";

    private static DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    private static StorageReference storageReference = FirebaseStorage.getInstance().getReference();

    public static Employee pushNewEmployee(Employee employee){
        DatabaseReference reference = databaseReference.child(EMPLEADOS).push();
        reference.setValue(employee);
        employee.setKey(reference.getKey());
        return employee;
    }

    public static StorageReference getReferenceForSaveUserImage(String pushId){
        return storageReference.child(IMAGENES.concat("/").concat(pushId));
    }

    public static void pushEmployeeToTrip(String busNumber, String userId, String userName) {
        HashMap<String, String> params = new HashMap<>();
        params.put("nombre", userName);
        Calendar calendar = Calendar.getInstance();
        String date = calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH);
        databaseReference.child(SALIDAS)
                .child(date)
                .child(String.valueOf(busNumber))
                .child(userId).setValue(params);
    }

}
