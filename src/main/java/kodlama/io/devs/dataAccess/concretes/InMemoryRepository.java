package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.devs.entity.concretes.SoftwareLanguage;

@Repository
public class InMemoryRepository implements SoftwareLanguageRepository {

	private List<SoftwareLanguage> languages;

	@Autowired
	public InMemoryRepository() {
		languages = new ArrayList<SoftwareLanguage>();
		languages.add(new SoftwareLanguage(1, "C"));
		languages.add(new SoftwareLanguage(2, "Java"));
		languages.add(new SoftwareLanguage(3, "C++"));
		languages.add(new SoftwareLanguage(4, "C#"));
		languages.add(new SoftwareLanguage(5, "Phyton"));
	}

	@Override
	public List<SoftwareLanguage> getAll() {
		return languages;
	}

	@Override
	public void add(SoftwareLanguage language) {
		languages.add(language);
	}

	@Override
	public void update(SoftwareLanguage language) {
		languages.set(language.getId() - 1, language);
	}

	@Override
	public void delete(SoftwareLanguage language) {
		languages.remove(language.getId() - 1);

	}

	@Override
	public SoftwareLanguage getById(int id) {
		return languages.get(id - 1);
	}

}
