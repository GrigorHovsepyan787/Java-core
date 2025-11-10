package homework.medicialCenter.doctor;

import homework.medicialCenter.Professions;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[0];
    private int size = 0;

    public void add(Doctor doctor) {
        if (size > doctors.length - 1) {
            extend();
        }
        doctors[size++] = doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[size + 1];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }

    public void searchByProf(Professions profession) {
        boolean found = false;
        for (Doctor doctor : doctors) {
            if (doctor.getProfession() == profession) {
                System.out.println(doctor);
                found = true;
            }
        }
        if (!found) {
            System.err.println("Couldn't find any doctors with that profession");
        }
    }

    public Doctor searchById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }

    public boolean isIdBusy(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmailBusy(String email) {
        for (Doctor doctor : doctors) {
            if (doctor.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumBusy(int num) {
        for (Doctor doctor : doctors) {
            if (doctor.getPhoneNumber() == num) {
                return true;
            }
        }
        return false;
    }

    public void deleteById(int id) {
        boolean found = false;
        Doctor[] tmp = new Doctor[doctors.length - 1];
        int temp = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (doctors[i].getId() == id) {
                temp++;
                found = true;
            }
            tmp[i] = doctors[temp];
            temp++;
        }
        if (found) {
            doctors = tmp;
            System.out.println("Doctor has ben successfully deleted!");
        } else {
            System.err.println("Couldn't find doctor with this id");
        }
    }
}

