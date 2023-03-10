public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        maxStation = 9;

    }

    public void RadioVolume(int maxVolume) {
        maxStation = maxVolume - 1;

    }
    public void RadioVolume() {
        maxStation = 9;

    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }
    public int next() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
        return 0;
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
        if (currentVolume > 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
    }

    public int nextStation() {
        if (currentRadioStation != maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
        return 0;
    }

    public void setCurrentRadio(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void prevRadio() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void setCurrentVolumeDecrease(int currentVolume) {
        this.currentVolume = currentVolume;
        if (currentVolume > 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }

    }
    public void RadioVolumeIncrease(int currentVolume) {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
}