/*
varchar(255) for column comment is too small update it to 1024
*/
ALTER TABLE `test` CHANGE COLUMN `comment` `comment` VARCHAR(1024) NULL DEFAULT NULL ;