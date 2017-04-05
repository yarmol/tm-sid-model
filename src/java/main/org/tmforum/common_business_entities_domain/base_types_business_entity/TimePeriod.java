/**
* Base Types ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D801BAB03B0-content.html">Base Types ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.base_types_business_entity ;

/**
* A base / value business entity used to represent a period of time, bet 
* ween two timepoints 
 @since SID_R16.5
*/ 

public  class TimePeriod  {



/**  
* Field startDateTime
* An instant of time, starting at the TimePeriod</br></br>Notes:</br>If  

* null, then represents to the beginning of time 

*/
protected Object startDateTime ;




/**  
* Field endDateTime
* An instant of time, ending at the TimePeriod:</br></br>Notes:</br>If n 

* ull, then represents to the end of time 

*/
protected Object endDateTime ;


}