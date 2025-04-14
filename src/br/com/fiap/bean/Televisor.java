package br.com.fiap.bean;

public class Televisor {
    // atributos
    private int volume;
    private int canal;

    // métodos
    public void aumentarVolume() {
        if (volume < 20 ) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    // getters/setters
    public int getVolume() {
        return volume;
    }
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13 ) {
                this.canal = canal;
            } else {
                throw new Exception("Canal fora de ar! (Canais no ar= 2, 4, 5, 7, 13)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume<= 20) {
                this.volume = volume;
            } else {
                throw new Exception("Volume fora da faixa permitida! (min=0 até max=20)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}