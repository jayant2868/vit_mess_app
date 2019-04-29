package com.example1.jayantsharma.meandmymess;



public class DatabaseAccess {


    String[][] a = {{"17BCE0382", "hello", "jayant.babu2017@vitstudent.ac.in", "F-213", "VEG", "MHPL 1 - VEG MESS (F-BLOCK)", "JAYANT BABU"},
            {"17BCE0990", "hello2", "kunwar.taneja2017@vitstudent.ac.in", "B-232", "SPECIAL", "PR 2 - SPECIAL MESS (B-ANNEX)", "KUNWAR TANEJA"},
            {"17BCE2178", "hello3", "anant.raj2017@vitstudent.ac.in", "H-338", "VEG", "CRC 1 - VEG MESS (H-BLOCK)", "ANANT RAJ"},
            {"17BCE0056", "hello4", "Harsh.kumar2017@vitstudent.ac.in", "L-351", "PAID", "RRC 5 - FOOD MALL (L-BLOCK)", "HARSH KUMAR"},
            {"17BME0134", "hello5", "mukund.misra2017@vitstudent.ac.in", "D-521", "SPECIAL", "RRC 4 - SPECIAL MESS (D- ANNEX)", "MUKUND MISRA"},
            {"17BIT0301", "hello6", "prateek.raj2017@vitstudent.ac.in", "F-452", "NON VEG", "AAC 1 - NON VEG MESS (F-BLOCK)", "PRATEEK RAJ"},
            {"17BCE0004", "hello7", "kumar.vaibhav2017@vitstudent.ac.in", "K-231", "PAID", "ZEN 4 - FOODCY (K-BLOCK)", "KUMAR VAIBHAV"},
            {"17BCE0005", "hello8", "anmol.singh2017@vitstudent.ac.in", "P-213", "SPECIAL", "PR 4 - SPECIAL MESS (P-BLOCK)", "ANMOL SINGH"},
            {"17BCE0006", "hello9", "harsh.raj2017@vitstudent.ac.in", "P-513", "NON VEG", "DR 1 - NON VEG (P-BLOCK)", "HARSH RAJ"}};

    public String student_name(String user5) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][0].equalsIgnoreCase(user5)) {
                c = a[i][6];
                break;
            }
        }
        return c;
    }

    public String password(String user) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][j].equalsIgnoreCase(user)) {
                c = a[i][1];
                break;
            }
        }
        return c;
    }

    public String email_id(String user1) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][j].equalsIgnoreCase(user1)) {
                c = a[i][2];
                break;
            }
        }
        return c;
    }

    public String Room_no(String user2) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][j].equalsIgnoreCase(user2)) {
                c = a[i][3];
                break;
            }
        }
        return c;
    }

    public String mess_type(String user3) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][j].equalsIgnoreCase(user3)) {
                c = a[i][4];
                break;
            }
        }
        return c;
    }

    public String mess_name(String user4) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][0].equalsIgnoreCase(user4)) {
                c = a[i][5];
                break;
            }
        }
        return c;
    }
    public void changemess(String newmess,String user)
    {
        for(int i=0;i<9;i++) {
            if (a[i][0].equalsIgnoreCase(user)) {
                a[i][5] = newmess;
            }
        }
    }
public int count()
{
    int p=a.length;
    return p;
}
public String getuser(int position)
{
    return a[position][0];
}

}
