/**
* Base Types ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D801BAB03B0-content.html">Base Types ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.base_types_business_entity ;

/**
* A base / value business entity used to represent money 
 @since SID_R16.5
*/ 

public  class Money  {



/**  
* Field units
* Currency(Notes:refer to [ISO 4217]) or non-currency terms, such as loy 

* alty points.</br> 

*/
protected String units ;




/**  
* Field amount
* A positive floating point number. 

*/
protected long amount ;


}