import java.util.List;

public abstract class ChangeRequest {


    ///////////////////////////////////////////////////////////////////
    ////                         private variables                 ////
    // A description of the change.
    private String _description;

    // A flag indicating whether the error has been reported.
    private boolean _errorReported;

    // The exception thrown by the most recent call to execute(), if any.
    private Exception _exception;

    // A flag indicating whether this change is a structural one.
    private boolean _isStructuralChange;

    // A list of listeners or weak references to listeners
    // that are given in setListeners().
    private List _listeners;

    // A list of listeners that are maintained locally.
    private List<IChangeListener> _localListeners;




    public ChangeRequest(String _description, boolean _errorReported, Exception _exception, boolean _isStructuralChange, List _listeners) {
        this._description = _description;
        this._errorReported = _errorReported;
        this._exception = _exception;
        this._isStructuralChange = _isStructuralChange;
        this._listeners = _listeners;
    }



}






