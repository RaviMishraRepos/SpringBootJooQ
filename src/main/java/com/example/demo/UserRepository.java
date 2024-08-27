package com.example.demo;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tej.JooQDemo.jooq.sample.model.tables.User;
import com.tej.JooQDemo.jooq.sample.model.tables.records.UserRecord;

@Repository
public class UserRepository {

	@Autowired
	private DSLContext dsl;

	public List<UserRecord> findAllUsers() {
		return dsl.selectFrom(User.USER).fetchInto(UserRecord.class);
	}

	public UserRecord findUserById(int id) {
		return dsl.selectFrom(User.USER).where(User.USER.ID.eq(id)).fetchOneInto(UserRecord.class);
	}

	public void insertUser(UserRecord userRecord) {
		dsl.insertInto(User.USER).set(userRecord).execute();
	}

	public void updateUser(UserRecord userRecord) {
		dsl.update(User.USER).set(userRecord).where(User.USER.ID.eq(userRecord.getId())).execute();
	}

	public void deleteUser(int id) {
		dsl.deleteFrom(User.USER).where(User.USER.ID.eq(id)).execute();
	}
}