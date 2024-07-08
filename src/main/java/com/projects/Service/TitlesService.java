package com.projects.Service;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.projects.Repository.TitlesRepository;
import com.projects.model.Employees;
import com.projects.model.Titles;

@Service
@Transactional
public class TitlesService {

	
	private final TitlesRepository titlesRepository;
	
	  //Construct injection
		public TitlesService(TitlesRepository titlesRepository) {

			this.titlesRepository = titlesRepository;

		}
		
		public void saveMyTitle(Titles title) {

			titlesRepository.save(title);
		}

}
