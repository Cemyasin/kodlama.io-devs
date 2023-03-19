package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.SoftwareLanguageService;
import kodlama.io.devs.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.devs.entity.concretes.SoftwareLanguage;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService{
	private SoftwareLanguageRepository softwareLanguageRepository;

	@Autowired
	public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository) {
		this.softwareLanguageRepository = softwareLanguageRepository;
	}

	@Override
	public List<SoftwareLanguage> getAll() {
		return softwareLanguageRepository.getAll();
	}

	@Override
	public void add(SoftwareLanguage language) throws Exception {
		List<SoftwareLanguage> existingLanguages;
		existingLanguages=softwareLanguageRepository.getAll();
		
		for (SoftwareLanguage softwareLanguage : existingLanguages) {
			if(softwareLanguage.getName().equalsIgnoreCase(language.getName())) {
				throw new Exception(" Lütfen sistemde mevcut olmayan bir dil giriniz !!! ");
			}
		}
		if(language.getName().isEmpty())
			throw new Exception("Programlama dili boş bırakılamaz !!!");
		
		softwareLanguageRepository.add(language);
	}

	@Override
	public void update(SoftwareLanguage language) throws Exception {
		if(language.getName().isEmpty())
			throw new Exception("Programlama dili boş bırakılamaz !!!");
		softwareLanguageRepository.update(language);
		
	}

	@Override
	public void delete(SoftwareLanguage language) {
	softwareLanguageRepository.delete(language);
		
	}

	@Override
	public SoftwareLanguage getById(int id) {
		return softwareLanguageRepository.getById(id);
	}
	
	
	
}
