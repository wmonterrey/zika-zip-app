/*
 * Copyright (C) 2013 ICS.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package ni.org.ics.zip.appmovil.utils;

/**
 * Constantes usadas en la base de datos de la aplicacion
 * 
 * @author William Aviles
 * 
 */
public class MainDBConstants {

	//Base de datos y tablas
	public static final String DATABASE_NAME = "zikazipcryp.sqlite3";
	public static final int DATABASE_VERSION = 1;
	
	//Tabla usuarios
	public static final String USER_TABLE = "users";
	//Campos usuarios
	public static final String username = "username";
	public static final String created = "created";
	public static final String modified = "modified";
	public static final String lastAccess = "lastaccess";
	public static final String password = "password";
	public static final String completeName = "completename";
	public static final String email = "email";
	public static final String enabled = "enabled";
	public static final String accountNonExpired = "accountnonexpired";
	public static final String credentialsNonExpired = "credentialsnonexpired";
	public static final String lastCredentialChange = "lastcredentialchange";
	public static final String accountNonLocked = "accountnonlocked";
	public static final String createdBy = "createdby";
	public static final String modifiedBy = "modifiedby";
	//Crear tabla usuarios
	public static final String CREATE_USER_TABLE = "create table "
			+ USER_TABLE + " ("
			+ username + " text not null, "  
			+ created + " date, " 
			+ modified + " date, "
			+ lastAccess + " date, "
			+ password + " text not null, "
			+ completeName + " text, "
			+ email + " text, "
			+ enabled  + " boolean, " 
			+ accountNonExpired  + " boolean, "
			+ credentialsNonExpired  + " boolean, "
			+ lastCredentialChange + " date, "
			+ accountNonLocked  + " boolean, "
			+ createdBy + " text, "
			+ modifiedBy + " text, "
			+ "primary key (" + username + "));";
	
	//Tabla roles
	public static final String ROLE_TABLE = "roles";
	//Campos roles
	public static final String role = "role";
	//Crear tabla roles
	public static final String CREATE_ROLE_TABLE = "create table "
			+ ROLE_TABLE + " ("
			+ username + " text not null, "  
			+ role + " text not null, "
			+ "primary key (" + username + "," + role + "));";
	
	//Campos metadata
	public static final String recordDate = "recordDate";
	public static final String recordUser = "recordUser";
	public static final String pasive = "pasive";
	//Campos comunes para manejo ODK
	public static final String ID_INSTANCIA = "id_instancia";
	public static final String FILE_PATH = "path_instancia";
	public static final String STATUS = "estado";
	//Campos comunes para metadata movil
	public static final String START = "creado";
	public static final String END = "finalizado";
	public static final String DEVICE_ID = "identificador_equipo";
	public static final String SIM_SERIAL = "serie_sim";
	public static final String PHONE_NUMBER = "numero_telefono";
	public static final String TODAY = "fecha_registro";

	
	//Tabla usuarios
	public static final String SCREENING_TABLE = "zp00_screening";
	//Campos usuarios
	public static final String recordId = "recordId";
	//public static final String numScreening = "numScreening";
	public static final String scrVisitDate = "scrVisitDate";
	public static final String scrRemain = "scrRemain";
	public static final String scrAge = "scrAge";
	public static final String scrAge15 = "scrAge15";
	public static final String scrPregnant = "scrPregnant";
	public static final String scrPreWeeks = "scrPreWeeks";
	public static final String scrPreDays = "scrPreDays";
	public static final String scrPregant13 = "scrPregant13";
	public static final String scrZikaOther = "scrZikaOther";
	public static final String scrMeetCriteria = "scrMeetCriteria";
	public static final String scrConsentObta = "scrConsentObta";
	public static final String scrObDobDay = "scrObDobDay";
	public static final String scrObDobMon = "scrObDobMon";
	public static final String scrObDobYear = "scrObDobYear";
	public static final String scrObAge = "scrObAge";
	public static final String scrObAssent = "scrObAssent";
	public static final String scrConsentA = "scrConsentA";
	public static final String scrConsentB = "scrConsentB";
	public static final String scrConsentC = "scrConsentC";
	public static final String scrConsentD = "scrConsentD";
	public static final String scrConsentE = "scrConsentE";
	public static final String scrConsentF = "scrConsentF";
	public static final String scrPreviousZip = "scrPreviousZip";
	public static final String scrPreviousStudyId = "scrPreviousStudyId";
	public static final String scrPreStudyNa = "scrPreStudyNa";
	public static final String scrReasonNot = "scrReasonNot";
	public static final String scrReasonOther = "scrReasonOther";
	public static final String scrIdCompleting = "scrIdCompleting";
	public static final String scrDateCompleted = "scrDateCompleted";
	public static final String scrIdReviewer = "scrIdReviewer";
	public static final String scrDateReviewed = "scrDateReviewed";
	public static final String scrIdDataEntry = "scrIdDataEntry";
	public static final String scrDateEntered = "scrDateEntered";

	//Crear tabla usuarios
	public static final String CREATE_SCREENING_TABLE = "create table "
			+ SCREENING_TABLE + " ("
			+ recordId + " text not null, "
			+ scrVisitDate + " date, " 
			+ scrRemain + " text, "
			+ scrAge + " integer, "
			+ scrAge15  + " text, " 
			+ scrPregnant + " text, "
			+ scrPreWeeks + " integer, "
			+ scrPreDays + " integer, "
			+ scrPregant13  + " text, " 
			+ scrZikaOther  + " text, " 
			+ scrMeetCriteria  + " text, " 
			+ scrConsentObta  + " text, " 
			+ scrObDobDay + " text, "
			+ scrObDobMon + " text, "
			+ scrObDobYear + " integer, "
			+ scrObAge + " integer, "
			+ scrObAssent + " text, "
			+ scrConsentA + " text, "
			+ scrConsentB + " text, "
			+ scrConsentC + " text, "
			+ scrConsentD + " text, "
			+ scrConsentE + " text, "
			+ scrConsentF + " text, "
			+ scrPreviousZip + " text, "
			+ scrPreviousStudyId + " text, "
			+ scrPreStudyNa  + " text, "
			+ scrReasonNot + " text, "
			+ scrReasonOther + " text, "
			+ scrIdCompleting + " text, "
			+ scrDateCompleted + " date, "
			+ scrIdReviewer + " text, "
			+ scrDateReviewed + " date, "
			+ scrIdDataEntry + " text, "
			+ scrDateEntered + " date, "
			+ recordDate + " date, " 
			+ recordUser + " text, "
			+ pasive + " text, "
			+ ID_INSTANCIA + " integer," 
			+ FILE_PATH + " text," 
			+ STATUS + " text not null, "
			+ START  + " text, "
			+ END  + " text, "
			+ DEVICE_ID  + " text, "
			+ SIM_SERIAL + " text, "
			+ PHONE_NUMBER  + " text, "
			+ TODAY  + " date, "
			+ "primary key (" + recordId + "));";

}