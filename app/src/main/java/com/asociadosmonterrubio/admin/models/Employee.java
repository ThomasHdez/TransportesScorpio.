package com.asociadosmonterrubio.admin.models;

import android.graphics.Bitmap;

/**
 * Created by joseluissanchezcruz on 3/12/17.
 */

public class Employee {

    public static final String JORNALERO = "Jornalero";

    private String key;
    private String Actividad;
    private String ApellidoMATERNO;
    private String ApellidoPATERNO;
    private String CURP;
    private String Contrato;
    private String FechaNACIMIENTO;
    private String LugarNACIMIENTO;
    private String Nombre;
    private Bitmap image;
    private long ID;

    public Employee(){ }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String actividad) {
        Actividad = actividad;
    }

    public String getApellidoMATERNO() {
        return ApellidoMATERNO;
    }

    public void setApellidoMATERNO(String apellidoMATERNO) {
        ApellidoMATERNO = apellidoMATERNO;
    }

    public String getApellidoPATERNO() {
        return ApellidoPATERNO;
    }

    public void setApellidoPATERNO(String apellidoPATERNO) {
        ApellidoPATERNO = apellidoPATERNO;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getContrato() {
        return Contrato;
    }

    public void setContrato(String contrato) {
        Contrato = contrato;
    }

    public String getFechaNACIMIENTO() {
        return FechaNACIMIENTO;
    }

    public void setFechaNACIMIENTO(String fechaNACIMIENTO) {
        FechaNACIMIENTO = fechaNACIMIENTO;
    }

    public String getLugarNACIMIENTO() {
        return LugarNACIMIENTO;
    }

    public void setLugarNACIMIENTO(String lugarNACIMIENTO) {
        LugarNACIMIENTO = lugarNACIMIENTO;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
