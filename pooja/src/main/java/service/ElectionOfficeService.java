package service;

import java.util.List;

import entities.ElectionOfficer;

public interface ElectionOfficeService {
	ElectionOfficer addElectionOfficerDetails(ElectionOfficer officer);
	ElectionOfficer updateElectionOfficerDetails(ElectionOfficer officer);
	int deleteElectionOfficer(int officerid);
	ElectionOfficer viewElectionOfficerByid(int officerid);
	List<ElectionOfficer> viewElectionOfficerList();

}
