package com.example1.jayantsharma.meandmymess;

public class Complaints {
    String ComplaintId;
    String Feedback;
    int Rating;

    public Complaints()
    {}

    public Complaints(String complaintId, String feedback, int rating) {
        ComplaintId = complaintId;
        Feedback = feedback;
        Rating = rating;
    }

    public String getComplaintId() {
        return ComplaintId;
    }

    public void setComplaintId(String complaintId) {
        ComplaintId = complaintId;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public String getFeedback() {

        return Feedback;
    }

    public int getRating() {

        return Rating;
    }
}
