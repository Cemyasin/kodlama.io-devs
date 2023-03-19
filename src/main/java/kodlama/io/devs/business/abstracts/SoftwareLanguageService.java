package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entity.concretes.SoftwareLanguage;

public interface SoftwareLanguageService {
	List<SoftwareLanguage> getAll();
	void add(SoftwareLanguage language) throws Exception;
	void update(SoftwareLanguage language) throws Exception;
	void delete(SoftwareLanguage language);
	SoftwareLanguage getById(int id);
}
