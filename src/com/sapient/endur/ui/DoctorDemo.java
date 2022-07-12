package com.sapient.endur.ui;

import com.sapient.endur.model.Doctor;
import com.sapient.endur.model.FamilyDoctor;
import com.sapient.endur.model.Surgeon;
/*
 * To achieve runtime polymorphic benaviour, the sub class instances have to be 
 * pointed by super class references.
 * 
 * Use instanceof operator to check the instance is of which sub class type
 */
public class DoctorDemo {

	public static void main(String[] args) {
		//Array of references of Doctor type
		Doctor doctor[]= new Doctor[4];
		doctor[0]= new Surgeon("Smith","Apollo Hospitals");
		doctor[1]=new FamilyDoctor("Clarke","Sunshine Hospitals",100);
		doctor[2]= new FamilyDoctor("John","Rainbow Hospitals",150);
		doctor[3] = new Surgeon("Ravi","AIMS Hospitals");
		
		for(Doctor d: doctor) {
			if(d instanceof Surgeon) {
				System.out.println("Surgeon Name: "+d.getDoctorName());
			}else if(d instanceof FamilyDoctor) {
				System.out.println("Family Doctor Name: "+d.getDoctorName());
			}
			d.treatPatient();
			System.out.println("---------------------");
		}
		
		
		
	}

}



