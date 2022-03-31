package repository;

import java.util.List;

public interface CooperativeSociety {
	CooperativeSociety addSocietyDetails(int CooperativeSociety);
	CooperativeSociety updateSocietyDetails(int CooperativeSociety);
	int deleteSociety(int societyId);
	List<CooperativeSociety> viewSocietyList();
	CooperativeSociety viewSocietyById(int societyId);

}
