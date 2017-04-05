/**
* PLA Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6.w.dB.sBP5E.d-O57.wBCB.zL.fA-content.html">PLA Spec ABE</a> 
* The PLA Spec ABE specifies Pricing Logic Algorithm. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.pricing_logic_algorithm_abe.pla_spec_business_entity ;

/**
* A specification of a single dimension of MatrixCharacteristic. Each di 
* mension is defined by a single CharacteristicSpecification or ProductS 
* pecCharacteristic which specifies the legal values for this dimension. 
*   
 @since SID_R16.5
*/ 

public  class MatrixSpecDimension  {



/**  
* Field matrixCharacteristicSpec
*/
protected List<MatrixCharacteristicSpec> matrixCharacteristicSpec ;




/**  
* Field productSpecCharacteristic
*/
protected ProductSpecCharacteristic productSpecCharacteristic ;




/**  
* Field characteristicSpecification
*/
protected CharacteristicSpecification characteristicSpecification ;




/**  
* Field seqNum
* The sequential (ordered) number of this dimension 

*/
protected Integer seqNum ;




/**  
* Field validFor
* The period during which the MatrixSpecDimensionis applicable.  

*/
protected TimePeriod validFor ;


}