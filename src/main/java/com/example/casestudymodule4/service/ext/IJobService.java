package com.example.casestudymodule4.service.ext;

import com.example.casestudymodule4.model.Job;
import com.example.casestudymodule4.service.core.ICoreService;

public interface IJobService extends ICoreService<Job>
{

    Iterable<Job> findJobsByQLOrLCOrPLanguage(Long programmingLanguageId,
                                              String qualificationName,
                                              String cityName);
}
