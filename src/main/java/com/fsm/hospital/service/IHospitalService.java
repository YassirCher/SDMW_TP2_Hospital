package com.fsm.hospital.service;

import com.fsm.hospital.entities.Consultation;
import com.fsm.hospital.entities.Medecin;
import com.fsm.hospital.entities.Patient;
import com.fsm.hospital.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
