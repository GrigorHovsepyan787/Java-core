package homework.medicialCenter.patient;

import homework.medicialCenter.doctor.Doctor;

public class PatientStorage {
    private Patient[] patients = new Patient[0];
    private int size = 0;

    public void add(Patient patient) {
        if (size > patients.length - 1) {
            extend();
        }
        patients[size++] = patient;
    }

    public int getSize() {
        return patients.length;
    }

    private void extend() {
        Patient[] tmp = new Patient[size + 1];
        System.arraycopy(patients, 0, tmp, 0, patients.length);
        patients = tmp;
    }

    public void print() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void printDoc(Doctor doctor) {
        for (Patient patient : patients) {
            if (patient.getDoctor().equals(doctor)) {
                System.out.println(patient);
            }
        }
    }

    public boolean isIdBusy(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumBusy(int num) {
        for (Patient patient : patients) {
            if (patient.getPhoneNumber() == num) {
                return true;
            }
        }
        return false;
    }
}
