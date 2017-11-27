/*******************************************************************************
 * (C) Copyright 2014 - CounterPath Corporation. All rights reserved.
 * 
 * THIS SOURCE CODE IS PROVIDED AS A SAMPLE WITH THE SOLE PURPOSE OF DEMONSTRATING A POSSIBLE
 * USE OF A COUNTERPATH API. IT IS NOT INTENDED AS A USABLE PRODUCT OR APPLICATION FOR ANY 
 * PARTICULAR PURPOSE OR TASK, WHETHER IT BE FOR COMMERCIAL OR PERSONAL USE.
 * 
 * COUNTERPATH DOES NOT REPRESENT OR WARRANT THAT ANY COUNTERPATH APIs OR SAMPLE CODE ARE FREE
 * OF INACCURACIES, ERRORS, BUGS, OR INTERRUPTIONS, OR ARE RELIABLE, ACCURATE, COMPLETE, OR 
 * OTHERWISE VALID.
 * 
 * THE COUNTERPATH APIs AND ASSOCIATED SAMPLE APPLICATIONS ARE PROVIDED "AS IS" WITH NO WARRANTY, 
 * EXPRESS OR IMPLIED, OF ANY KIND AND COUNTERPATH EXPRESSLY DISCLAIMS ANY AND ALL WARRANTIES AND 
 * CONDITIONS, INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR 
 * A PARTICULAR PURPOSE, AVAILABLILTIY, SECURITY, TITLE AND/OR NON-INFRINGEMENT.  
 * 
 * YOUR USE OF COUNTERPATH APIS AND SAMPLE CODE IS AT YOUR OWN DISCRETION AND RISK, AND YOU WILL 
 * BE SOLELY RESPONSIBLE FOR ANY DAMAGE THAT RESULTS FROM THE USE OF ANY COUNTERPATH APIs OR
 * SAMPLE CODE INCLUDING, BUT NOT LIMITED TO, ANY DAMAGE TO YOUR COMPUTER SYSTEM OR LOSS OF DATA. 
 * 
 * COUNTERPATH DOES NOT PROVIDE ANY SUPPORT FOR THE SAMPLE APPLICATIONS.
 * 
 * TO OBTAIN A COPY OF THE OFFICIAL VERSION OF THE TERMS OF USE FOR COUNTERPATH APIs, PLEASE 
 * DOWNLOAD IT FROM THE WEB_SITE AT: http://www.counterpath.com/apitou
 ******************************************************************************/
package com.counterpath.api.bria.enums;

public enum MessageBodyType {
	
	// Incoming body types
	
	EVENT_PHONE_STATUS_CHANGE,
	EVENT_CALL_STATUS_CHANGE,
	EVENT_CALL_HISTORY_CHANGE,
	EVENT_MISSED_CALL_OCCURRED,
	EVENT_MWI_COUNT_CHANGE,
	EVENT_AUDIO_SETTINGS_CHANGE,
	EVENT_CALL_OPTION_CHANGE,
	EVENT_AUTHENTICATION_CHANGE,
	EVENT_NWAY_CONFERENCE,
	
	RESPONSE_STATUS_AUTHENTICATION,
	RESPONSE_STATUS_PHONE,
	RESPONSE_STATUS_SYSTEM_SETTINGS,
	RESPONSE_STATUS_CALL,
	RESPONSE_STATUS_AUDIO_PROPERTIES,
	RESPONSE_STATUS_CALL_OPTIONS,
	RESPONSE_STATUS_CALL_HISTORY,
	RESPONSE_STATUS_MISSED_CALL,
	RESPONSE_STATUS_VOICEMAIL,
	
	// Outgoing body types
	
	REQUEST_AUTHENTICATE,
	REQUEST_SHOW_HISTORY,
	REQUEST_STATUS_PHONE,
	REQUEST_STATUS_SYSTEM_SETTINGS,
	REQUEST_STATUS_CALL,
	REQUEST_STATUS_AUDIO_PROPERTIES,
	REQUEST_STATUS_CALL_OPTIONS,
	REQUEST_PLACE_CALL,
	REQUEST_ANSWER_CALL,
	REQUEST_HOLD_CALL,
	REQUEST_RESUME_CALL,
	REQUEST_END_CALL,
	REQUEST_SEND_DTMF,
	REQUEST_SET_AUDIO_PROPERTIES,
	REQUEST_SET_CALL_OPTIONS,
	
	
	// Applicable to both incoming and outgoing
	
	BODYLESS;
	
}