package com.ahanasoftwares.bean.lifecycle.model;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "prototype")
@Component
public class Book implements  InitializingBean, DisposableBean, BeanFactoryAware, BeanNameAware, BeanClassLoaderAware{

	private static final Logger logger = LoggerFactory.getLogger(Book.class);
	private String bookName;
	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Book() {
		logger.debug("---inside constructor---");
	}

	@Override
	public void setBeanClassLoader(ClassLoader arg0) {
		logger.debug("---inside setBeanClassLoader---");
	}

	@Override
	public void setBeanName(String arg0) {
		logger.debug("---inside setBeanName---");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		logger.debug("---inside setBeanFactory---");
	}

	@Override
	public void destroy() throws Exception {
		logger.debug("---inside destroy---");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("---inside afterPropertiesSet---");
	}

}
