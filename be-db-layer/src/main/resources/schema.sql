DROP TABLE IF EXISTS Waypoints;
DROP TABLE IF EXISTS Booking;

CREATE TABLE Booking (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  passangerName VARCHAR(250) ,
  passangerContactNumber bigint ,
  pickUpTime VARCHAR(250) ,
  asap char(1),
  waitingTime int,
  numberOfPassangers int,
  price decimal,
  rating decimal,
  createdOn VARCHAR(250) ,
  modifiedOn VARCHAR(250) );




CREATE TABLE Waypoints (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  locality VARCHAR(250) ,
  latitude BIGINT,
  longitude BIGINT
);