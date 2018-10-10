/*
 * This program is part of the OpenLMIS logistics management information system platform software.
 * Copyright © 2017 VillageReach
 *
 * This program is free software: you can redistribute it and/or modify it under the terms
 * of the GNU Affero General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details. You should have received a copy of
 * the GNU Affero General Public License along with this program. If not, see
 * http://www.gnu.org/licenses.  For additional information contact info@OpenLMIS.org.
 */

package org.openlmis.hapifhir.i18n;

import java.util.Arrays;

public abstract class MessageKeys {
  private static final String DELIMITER = ".";

  private static final String SERVICE_PREFIX = "hapifhir";

  private static final String ERROR = "error";

  private static final String AUTHORIZATION = "authorization";

  private static final String MISSING = "missing";
  private static final String INCORRECT = "incorrect";

  private static final String ERROR_PREFIX = join(SERVICE_PREFIX, ERROR);

  public static final String MISSING_AUTHORIZATION = join(ERROR_PREFIX, AUTHORIZATION, MISSING);
  public static final String INCORRECT_AUTHORIZATION = join(ERROR_PREFIX, AUTHORIZATION, INCORRECT);

  private MessageKeys() {
    throw new UnsupportedOperationException();
  }

  private static String join(String... params) {
    return String.join(DELIMITER, Arrays.asList(params));
  }
}