package com.ding.park;


import java.io.Serializable;

public class InParkingData  implements Serializable {

    String carNo;
    int carType;
    long  time;
    String parkingEnter;

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getParkingEnter() {
        return parkingEnter;
    }

    public void setParkingEnter(String parkingEnter) {
        this.parkingEnter = parkingEnter;
    }

    @Override
    public String toString() {
        return "InParkingData{" +
                "carNo='" + carNo + '\'' +
                ", carType=" + carType +
                ", time=" + time +
                ", parkingEnter='" + parkingEnter + '\'' +
                '}';
    }
}
