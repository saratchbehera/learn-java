package thelazyguy.learnjava.solidprinciple.lsp;

public abstract class SocialMediaBadDesign {
    
    public abstract  void chatWithFriend();
    
    public abstract void publishPost(Object post);
    
    public abstract  void sendPhotosAndVideos();
    
    public abstract  void groupVideoCall(String... users);
}