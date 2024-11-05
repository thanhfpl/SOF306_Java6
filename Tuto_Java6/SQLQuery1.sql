
	CREATE DATABASE TUTOJAVA6
	GO
	USE TUTOJAVA6
	GO


	CREATE TABLE khach_hang (
		id int IDENTITY(1,1) NOT NULL,
		ho_ten nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
		dia_chi nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
		sdt varchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
		trang_thai varchar(50) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
		ngay_tao datetime NULL,
		ngay_sua datetime NULL,
		CONSTRAINT PK__khach_ha__3213E83FDEF3BDA7 PRIMARY KEY (id)
	);


	CREATE TABLE hoa_don (
		id int IDENTITY(1,1) NOT NULL,
		id_khach_hang int NULL,
		trang_thai varchar(50) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
		ngay_tao datetime NULL,
		ngay_sua datetime NULL,
		dia_chi nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
		so_dien_thoai varchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
		CONSTRAINT PK__hoa_don__3213E83FFA73A1C9 PRIMARY KEY (id)
	);
	ALTER TABLE hoa_don ADD CONSTRAINT fk_khach_hang FOREIGN KEY (id_khach_hang) REFERENCES khach_hang(id) ON DELETE CASCADE ON UPDATE CASCADE;