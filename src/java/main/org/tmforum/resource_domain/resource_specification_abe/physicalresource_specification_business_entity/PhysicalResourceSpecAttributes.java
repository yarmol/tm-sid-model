/**
* PhysicalResource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA3F70337-content.html">PhysicalResource Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.physicalresource_specification_business_entity ;

/**
* The PhysicalResourceSpecAttributes handles specific attributes used to 
*  describe an atomic PhysicalResourceSpec. 
 @since SID_R16.5
*/ 

public  class PhysicalResourceSpecAttributes  {



/**  
* Field modelNumber
* This is a string that represents a manufacturer-allocated number used  

* to identify the general type and/or category of the hardware item. Thi 

* s, in combination with the PartNumber and the VendorName, identify dif 

* ferent types of hardware items. The SerialNumber can then be used to d 

* ifferentiate between different instances of the same type of hardware  

* item. This is an optional attribute. 

*/
protected String modelNumber ;




/**  
* Field vendorName
* This is a string that defines the name of the manufacturer. This, in c 

* ombination with the ModelNumber and the PartNumber, identify different 

*  types of hardware items. The SerialNumber can then be used to differe 

* ntiate between different instances of the same type of hardware item.  

* This is a REQUIRED attribute. 

*/
protected String vendorName ;




/**  
* Field skuNumber
* This is a string that defines the manufacturer-allocated Stock Keeping 

*  Unit (SKU) number of the hardware item. This is an optional attribute 

* . 

*/
protected String skuNumber ;




/**  
* Field partNumber
* This is a string that defines a manufacturer-allocated part number ass 

* igned by the organization that manufactures the hardware item. This, i 

* n combination with the ModelNumber and the VendorName, identify differ 

* ent types of hardware items. The SerialNumber can then be used to diff 

* erentiate between different instances of the same type of hardware ite 

* m. This is a REQUIRED attribute. 

*/
protected String partNumber ;




/**  
* Field physicalResourceSpec
*/
protected PhysicalResourceSpec physicalResourceSpec ;


}