/**
* Test ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_CN2.cED6.jE.eS.l.f7G.uC.b7.u.hA-content.html">Test ABE</a> 
* A test is a function performed on a product, service, or resource that 
*  results in measures being produced that reflect the functioning of th 
* e entity under test. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.test_business_entity ;

/**
* A TestMeasureDefinition specifies a measure of a specific aspect of a  
* product, service, or resource test, such as lost packets or connectivi 
* ty status. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Metric ABE::Metric Definition Measure ABE::MetricDefMeasure @since SID_R16.5
*/ 

public  class TestMeasureDefinition extends MetricDefMeasure {



/**  
* Field testSpecification
*/
protected List<TestSpecification> testSpecification ;


}