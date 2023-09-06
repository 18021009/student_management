package com.example.studentmanager.dto.student.request;


import com.example.studentmanager.utils.Regex;
import com.example.studentmanager.utils.exeption.DateOfBirthException;
import com.example.studentmanager.utils.exeption.FullNameException;
import com.example.studentmanager.utils.exeption.PhoneNumberException;

public class StudentDataForAddStudentRequest {
    private final String fullName;
    private final String address;
    private final String dateOfBirth;
    private final String phoneNumber;
    private final double englishScore;
    private final double entryTestScore;
    private final double gpa;
    private final String bestRewardName;

    public StudentDataForAddStudentRequest(String fullName, String address, String dateOfBirth, String phoneNumber, double englishScore, double entryTestScore, double gpa, String bestRewardName) {
        if(!Regex.DATE_REGEX.getPattern().matcher(dateOfBirth).find())throw new DateOfBirthException();
        if(fullName.length() < 10 || fullName.length() > 50)throw new FullNameException();
        if(!Regex.PHONE_NUMBER_REGEX.getPattern().matcher(phoneNumber).find())throw new PhoneNumberException();
        try{
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
        }catch (Exception e){
            System.out.println(e.getMessage() + "what the hack");
            throw e;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public double getGpa() {
        return gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    @Override
    public String toString() {
        return "StudentDataForAddStudentRequest{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                ", gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
                '}';
    }
}
