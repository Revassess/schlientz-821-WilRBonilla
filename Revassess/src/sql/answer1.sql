SELECT * FROM app_user LEFT JOIN user_role ON app_user.role_id = user_role.role_id WHERE user_role.name = 'BASIC_USER';

