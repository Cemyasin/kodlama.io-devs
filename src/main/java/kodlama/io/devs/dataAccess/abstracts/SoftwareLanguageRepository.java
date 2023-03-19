package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entity.concretes.SoftwareLanguage;

public interface SoftwareLanguageRepository {

	List<SoftwareLanguage> getAll();
	void add(SoftwareLanguage language);
	void update(SoftwareLanguage language);
	void delete(SoftwareLanguage language);
	SoftwareLanguage getById(int id);
}
