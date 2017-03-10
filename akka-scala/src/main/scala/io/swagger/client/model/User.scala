/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime

case class User (
  userId: Option[UUID],
  email: Option[String],
  password: Option[UUID],
  name: Option[String],
  surname: Option[String],
  tel: Option[String],
  invoiceAddress: Option[Address],
  deliveryAddresses: Option[Seq[Address]]
) extends ApiModel


