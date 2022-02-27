package com.example.demo.login.domain.model;

import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {

	@NotBlank(groups = ValidGroup1.class, message = "{require_check}")
	@Email(groups = ValidGroup2.class, message = "{email_check}")
	private String userId;

	@NotBlank(groups = ValidGroup1.class, message = "{require_check}")
	@Length(groups = ValidGroup2.class, min = 4, max = 100, message = "{length_check}")
	@Pattern(groups = ValidGroup3.class, regexp = "^[a-zA-Z0-9]+$", message = "{pattern_check}")
	private String password;

	@NotBlank(groups = ValidGroup1.class, message = "{require_check}")
	private String userName;

	@NotNull(groups = ValidGroup1.class, message = "{require_check}")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday;

	@Min(groups = ValidGroup2.class, value = 20, message = "{min_check}")
	@Max(groups = ValidGroup2.class, value = 100, message = "{max_check}")
	private int age;

	@AssertFalse(groups = ValidGroup1.class, message = "{false_check}")
	private boolean marriage;

}
