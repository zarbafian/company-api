package com.zarbafian.company.service;

import com.zarbafian.company.dao.OwnerRepository;
import com.zarbafian.company.model.Company;
import com.zarbafian.company.model.Owner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceBean implements OwnerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OwnerServiceBean.class);

    @Autowired
    private OwnerRepository ownerRepository;

    public List<Owner> findAll() {

        LOGGER.debug(">> findAll");

        List<Owner> owners = ownerRepository.findAll();

        LOGGER.debug("<< findAll");

        return owners;
    }

    public Owner findOne(Long id) {

        LOGGER.debug(">> findOne : {}", id);

        Owner owner = ownerRepository.getOne(id);

        LOGGER.debug("<< findOne : {}", owner);

        return owner;
    }

    public Owner create(Owner owner){

        LOGGER.debug(">> create : {}", owner);

        Owner createdOwner = ownerRepository.save(owner);

        LOGGER.debug("<< create : {}", owner);

        return owner;
    }

    public Owner update(Owner owner){

        LOGGER.debug(">> update : {}", owner);

        Owner updatedOwner = ownerRepository.save(owner);

        LOGGER.debug("<< update : {}", owner);

        return owner;
    }

    public void delete(Long id) {

        LOGGER.debug(">> delete : {}", id);

        ownerRepository.deleteById(id);

        LOGGER.debug("<< delete : {}", id);
    }

    @Override
    public List<Owner> getCompanyOwners(Company company) {

        LOGGER.debug(">> getCompanyOwners : {}", company);

        List<Owner> owners = ownerRepository.getCompanyOwners(company);

        LOGGER.debug(">> getCompanyOwners : {}", company);

        return owners;
    }
}
