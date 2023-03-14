package com.example.tareamapa;

import android.os.Parcel;
import android.os.Parcelable;

public class Persona implements Parcelable {
    private String codigo;
    private String correo;

    public Persona(String codigo, String correo) {
        this.codigo = codigo;
        this.correo = correo;
    }

    protected Persona(Parcel in) {
        codigo = in.readString();
        correo = in.readString();
    }

    public static final Parcelable.Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    public String getCodigo() {
        return codigo;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(codigo);
        dest.writeString(correo);
    }
}

