// package net.javaguides.springboot.exception;

// import java.util.Date;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.context.request.WebRequest;

// @ControllerAdvice
// public class GlobalExceptionHandler {

//     //handle specifix exception
//     @ExceptionHandler(ResourceNotFoundException.class)
//     public ResponseEntity<?> handleResousceNotFoundException
//     (ResourceNotFoundException exception, WebRequest request){
//         ErrorsDetails errorsDetails = new ErrorsDetails(new Date(), exception.getMessage(), request.getDescription(false));
//         return new ResponseEntity(errorsDetails, HttpStatus.NOT_FOUND);

//     }

//     //handle specifix exception
//     @ExceptionHandler(ApiException.class)
//     public ResponseEntity<?> handleApiException
//     (ApiException exception, WebRequest request){
//         ErrorsDetails errorsDetails = new ErrorsDetails(new Date(), exception.getMessage(), request.getDescription(false));
//         return new ResponseEntity(errorsDetails, HttpStatus.NOT_FOUND);

//     }


 
//     //handle global exception
//     @ExceptionHandler(Exception.class)
//     public ResponseEntity<?> hanldeGlobalException
//     (Exception exception, WebRequest request){
//         ErrorsDetails errorsDetails = new ErrorsDetails(new Date(), exception.getMessage(), request.getDescription(false));
//         return new ResponseEntity(errorsDetails, HttpStatus.INTERNAL_SERVER_ERROR);

//     }

    
// }
