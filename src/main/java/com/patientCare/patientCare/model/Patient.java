package com.patientCare.patientCare.model;

import lombok.*;

import javax.persistence.Entity;
import java.util.Date;
import java.util.UUID;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Patient {

    private UUID patientId = null;

    private Boolean active = null;

    private String firstName = null;

    private String lastName = null;

    private UUID orgId = null;

    private Date dateOfBirth = null;

    private String email = null;

    private String phoneNumber = null;

    private Date setupDate = null;

    private String streeAddress = null;

    private String city = null;

    private String state = null;

    private String zipCode = null;

    public enum GenderEnum {
        MALE("male"), FEMALE("female"), OTHER("other");

        private String value;

        GenderEnum(String value){this.value = value;}

    }

    private GenderEnum gender = null;






}
