package cs224n.langmodel;

import java.util.ArrayList;
import java.util.List;

public class OneParamEMZipfChimeraInterpolatedTriGramModel extends
    OneParamEMInterpolatedNGramModel {

  public OneParamEMZipfChimeraInterpolatedTriGramModel() {
    super(createModelList(), new ZipfChimeraInterpolatedTriGramModel(), 3);
  }

  private static List<NGram> createModelList() {
    List<NGram> models = new ArrayList<NGram>();
    models.add(new SmoothNGramModel(1));
    models.add(new BackoffZipfBiGramModel());
    models.add(new BackoffZipfTriGramModel());
    return models;
  }

}
