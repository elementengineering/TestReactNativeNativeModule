
#import "RNModule.h"

@implementation RNModule

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(helloWorld:(RCTResponseSenderBlock)callback) {
    NSLog(@"[react-native-module] start helloWorld");

    callback(@[@"Hello World From RNModule iOS"]);
}

@end
