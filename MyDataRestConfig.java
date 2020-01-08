package com.luv2code.spring_boot_ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.luv2code.spring_boot_ecommerce.entity.Product;
import com.luv2code.spring_boot_ecommerce.entity.ProductCategory;

@Configuration
public  class MyDataRestConfig  implements RepositoryRestConfigurer
{
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config)
	{
		
		HttpMethod[] theUnsupportedActions= {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
		
		//Disable http methods for Product
		config.getExposureConfiguration()
		.forDomainType(Product.class)
		.withItemExposure((metadata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metadata,httpMethods)->httpMethods.disable(theUnsupportedActions));
		
		//Disable http methods for ProductCategory
		config.getExposureConfiguration()
		.forDomainType(ProductCategory.class)
		.withItemExposure((metadata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metadata,httpMethods)->httpMethods.disable(theUnsupportedActions));
		
	}
}