package org.poondakfai.securegateway.oauthserver.common;

public final class DNSApiScopes {
  public static final String ADMIN           = "admin";
  public static final String ADVANCE         = "advance";
  public static final String STANDARD        = "standard";

  private static final String OR             = " or ";

  public static final class Oauth2 {
    // @TODO review me, the predicates reasoning for permission implicication
    public static final String HAS_SCOPE_ADMIN    = "#oauth2.hasScope('" + ADMIN + "')";
    public static final String HAS_SCOPE_ADVANCE  = HAS_SCOPE_ADMIN + OR + "#oauth2.hasScope('" + ADVANCE + "')";
    public static final String HAS_SCOPE_STANDARD = HAS_SCOPE_ADVANCE + OR + "#oauth2.hasScope('" + STANDARD + "')";
  }
}
