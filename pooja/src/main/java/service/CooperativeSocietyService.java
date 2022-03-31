package service;

import java.util.List;
import entities.CooperativeSociety;
public interface CooperativeSocietyService {
	CooperativeSociety addSocietyDetails(int CooperativeSociety);
	CooperativeSociety updateSocietyDetails(int CooperativeSociety);
	int deleteSociety(int societyId);
	List<CooperativeSociety> viewSocietyList();
	CooperativeSociety viewSocietyById(int societyId);

}
