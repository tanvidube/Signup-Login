package com.signin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.signin.Repository.AdminRepo;
import com.signin.Repository.CredRepo;
import com.signin.entity.Admin;
import com.signin.services.AdminService;
import com.signin.services.CredService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SignupLoginApplicationTests {
	
	@Autowired
	public AdminService ads;
	
	@Autowired
	public CredService credser;
	
	@MockBean
	public AdminRepo adr;
	
	@MockBean
	public CredRepo credrepo;

	@Test
	public void saveAllTest()
	 {
		Admin adm = new Admin("Tanvi" , "tanvi@admin.com" , 123456);
		when(adr.insert(adm)).thenReturn(adm);
		assertEquals(adm,ads.saveadmin(adm) );
		
	}
	@Test
	public void getAdminByEmailTest() {
		Admin adm = new Admin("Tanvi" , "tanvi@admin.com" , 123456);
		when(adr.findByAdminEmail(adm.getAdminEmail())).thenReturn(adm);
		assertEquals(adm, ads.findByAdminEmail(adm.getAdminEmail()) );
		
		}
//	@Test
//	public void updateByAdminIdTest() {
//		Admin adm = new Admin("Tanvi" , "tanvi@admin.com" , 123456);
//		ads.updateByAdminId(adm.getAdminId());
//		verify(adr,times(1)).updateByAdminId(adm.getAdminId());
//		
//		}
	@Test
	public void deleteByAdminIdTest() {
		Admin adm = new Admin("Tanvi" , "tanvi@admin.com" , 123456);
		ads.deleteByAdminId(adm.getAdminId());
		verify(adr , times(1)).deleteByAdminId(adm.getAdminId());
	}
	
}
