package factoryRequest;

public class FactoryRequest {


    public static Request make(String typeRequest){

        Request request;

        switch (typeRequest.toLowerCase()){
            case "get":
                request = new RequestGET();
                break;
            default:
                request = new RequestPOST();
                break;
        }

        return request;

    }
}