package com.example1.jayantsharma.meandmymess;

public class Pollingclass {
    String food1,food2,food3,food4,food5,terminate,id;
    public Pollingclass(){}



    public Pollingclass(String id, String food1, String food2, String food3, String food4, String food5) {
        this.id = id;
        this.food1 = food1;
        this.food2 = food2;
        this.food3 = food3;
        this.food4 = food4;
        this.food5 = food5;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFood1() {
        return food1;
    }

    public void setFood1(String food1) {
        this.food1 = food1;
    }

    public String getFood2() {
        return food2;
    }

    public void setFood2(String food2) {
        this.food2 = food2;
    }

    public String getFood3() {
        return food3;
    }

    public void setFood3(String food3) {
        this.food3 = food3;
    }

    public String getFood4() {
        return food4;
    }

    public void setFood4(String food4) {
        this.food4 = food4;
    }

    public String getFood5() {
        return food5;
    }

    public void setFood5(String food5) {
        this.food5 = food5;
    }

    public String getTerminate() {
        return terminate;
    }

    public void setTerminate(String terminate) {
        this.terminate = terminate;
    }
}

