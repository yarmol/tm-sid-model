/**
* Base Types ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D801BAB03B0-content.html">Base Types ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.base_types_business_entity ;

/**
* A base / value business entity used to represent measurements. 
 @since SID_R16.5
*/ 

public abstract class Quantity  {



/**  
* Field amount
* A quantity of something, typically the total of a thing or things in n 

* umber, size, value, extent, or money. 

*/
protected long amount ;




/**  
* Field units
* The unit of measure for the quantity, such as meters, cubic yards, kil 

* ograms [ISO 80000], and the currency referring to [ISO 4217]. 

*/
protected String units ;


}