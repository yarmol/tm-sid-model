/**
* PLA Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6.w.dB.sBP5E.d-O57.wBCB.zL.fA-content.html">PLA Spec ABE</a> 
* The PLA Spec ABE specifies Pricing Logic Algorithm. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.pricing_logic_algorithm_abe.pla_spec_business_entity ;

/**
* This entity specifies a characteristic which is not a scalar value but 
*  rather n-dimensional matrix. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Characteristic ABE::CharacteristicSpecification @since SID_R16.5
*/ 

public  class MatrixCharacteristicSpec extends CharacteristicSpecification {



/**  
* Field matrixSpecDimension2
*/
protected List<MatrixSpecDimension> matrixSpecDimension2 ;


}