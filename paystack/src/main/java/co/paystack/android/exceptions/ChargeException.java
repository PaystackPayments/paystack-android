package co.paystack.android.exceptions;

import static co.paystack.android.ConstantsKt.DEPRECATION_MESSAGE;

import kotlin.Deprecated;

/**
 * @author {androidsupport@paystack.co} on 9/25/15.
 * @deprecated This SDK has been deprecated, Please refer to our new SDK: https://paystack.com/docs/developer-tools/android-sdk/
 */
@Deprecated(message = DEPRECATION_MESSAGE)
public class ChargeException extends PaystackException {
    public ChargeException(String message) {
        super(message);
    }
}
