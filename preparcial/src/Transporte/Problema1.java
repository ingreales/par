package Transporte;

enum Transporte {
    BUS("4000", "30") {

    },


    BARCO("1200", "50"){

    },
    TREN("5000", "50") {

        },

        MOTO("1200","2") {

        },

        AVION("4211","100") {

        }

        ;


        private String tipomotor;

        private String capacidad;

    Transporte(String tipomotor, String capacidad) {
        this.tipomotor = tipomotor;
        this.capacidad = capacidad;
    }

    public String getTipomotor() {
        return tipomotor;
    }

    public void setTipomotor(String tipomotor) {
        this.tipomotor = tipomotor;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}



